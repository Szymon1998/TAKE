using Microsoft.EntityFrameworkCore;
using MvcNew.Models;

namespace MvcNew.Data
{
    public class NewsDbContext : DbContext
    {
        public NewsDbContext(DbContextOptions<NewsDbContext> options) :
        base(options)
        { }
        public DbSet<NewsItem> News { get; set; } = null!;
     }

}